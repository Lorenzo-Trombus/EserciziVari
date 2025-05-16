import sqlite3
from flask import Flask, request, jsonify
from datetime import datetime

app = Flask(__name__)

# Connessione al database
def get_db_connection():
    conn = sqlite3.connect('societa_immobiliare.db')
    conn.row_factory = sqlite3.Row
    return conn 

@app.route('/cercaCasaVendita', methods=['POST'])
def cerca_casa_vendita():
    data = request.get_json()
    indirizzo = data.get('indirizzo', '')
    prezzo_min = data.get('prezzo_min', 0)
    prezzo_max = data.get('prezzo_max', 1000000)
    
    conn = get_db_connection()
    query = f"""
    SELECT * FROM case_in_vendita 
    WHERE indirizzo LIKE ? 
    AND prezzo BETWEEN ? AND ? 
    AND stato = 'LIBERO'
    """
    params = ('%' + indirizzo + '%', prezzo_min, prezzo_max)
    result = conn.execute(query, params).fetchall()
    conn.close()

    case = [{'catastale': row['catastale'], 'indirizzo': row['indirizzo'], 'prezzo': row['prezzo']} for row in result]
    return jsonify(case)

@app.route('/cercaCasaAffitto', methods=['POST'])
def cerca_casa_affitto():
    data = request.get_json()
    indirizzo = data.get('indirizzo', '')
    prezzo_min = data.get('prezzo_min', 0)
    prezzo_max = data.get('prezzo_max', 10000)
    
    conn = get_db_connection()
    query = f"""
    SELECT * FROM case_in_affitto 
    WHERE indirizzo LIKE ? 
    AND prezzo_mensile BETWEEN ? AND ?
    """
    params = ('%' + indirizzo + '%', prezzo_min, prezzo_max)
    result = conn.execute(query, params).fetchall()
    conn.close()

    case = [{'catastale': row['catastale'], 'indirizzo': row['indirizzo'], 'prezzo_mensile': row['prezzo_mensile']} for row in result]
    return jsonify(case)

@app.route('/vendiCasa', methods=['POST'])
def vendi_casa():
    data = request.get_json()
    catastale = data['catastale']
    data_vendita = datetime.now().strftime('%Y-%m-%d')
    filiale_proponente = data['filiale_proponente']
    filiale_venditrice = data['filiale_venditrice']
    prezzo_vendita = data['prezzo_vendita']
    
    conn = get_db_connection()
    query = f"""
    INSERT INTO vendite_casa (catastale, data_vendita, filiale_proponente, filiale_venditrice, prezzo_vendita)
    VALUES (?, ?, ?, ?, ?)
    """
    conn.execute(query, (catastale, data_vendita, filiale_proponente, filiale_venditrice, prezzo_vendita))
    conn.commit()
    conn.close()
    
    return jsonify({"status": "success", "message": "Casa venduta correttamente"})

@app.route('/affittaCasa', methods=['POST'])
def affitta_casa():
    data = request.get_json()
    catastale = data['catastale']
    data_affitto = datetime.now().strftime('%Y-%m-%d')
    filiale_proponente = data['filiale_proponente']
    filiale_venditrice = data['filiale_venditrice']
    prezzo_affitto = data['prezzo_affitto']
    durata_contratto = data['durata_contratto']
    
    conn = get_db_connection()
    query = f"""
    INSERT INTO affitti_casa (catastale, data_affitto, filiale_proponente, filiale_venditrice, prezzo_affitto, durata_contratto)
    VALUES (?, ?, ?, ?, ?, ?)
    """
    conn.execute(query, (catastale, data_affitto, filiale_proponente, filiale_venditrice, prezzo_affitto, durata_contratto))
    conn.commit()
    conn.close()
    
    return jsonify({"status": "success", "message": "Casa affittata correttamente"})

@app.route('/reportVenditeAffitti', methods=['POST'])
def report_vendite_affitti():
    data = request.get_json()
    start_date = data['start_date']
    end_date = data['end_date']
    
    conn = get_db_connection()
    query = f"""
    SELECT filiale_proponente, COUNT(*) as num_vendite, SUM(prezzo_vendita) as totale_vendite
    FROM vendite_casa 
    WHERE data_vendita BETWEEN ? AND ?
    GROUP BY filiale_proponente
    """
    result = conn.execute(query, (start_date, end_date)).fetchall()
    conn.close()

    report = [{'filiale_proponente': row['filiale_proponente'], 'num_vendite': row['num_vendite'], 'totale_vendite': row['totale_vendite']} for row in result]
    return jsonify(report)

@app.route('/guadagnoFiliale', methods=['POST'])
def guadagno_filiale():
    data = request.get_json()
    start_date = data['start_date']
    end_date = data['end_date']
    
    conn = get_db_connection()
    query = f"""
    SELECT filiale_proponente, SUM(prezzo_vendita * 0.03) as guadagno_vendite, SUM(prezzo_affitto) as guadagno_affitti
    FROM vendite_casa
    LEFT JOIN affitti_casa
    ON vendite_casa.catastale = affitti_casa.catastale
    WHERE vendite_casa.data_vendita BETWEEN ? AND ?
    GROUP BY filiale_proponente
    """
    result = conn.execute(query, (start_date, end_date)).fetchall()
    conn.close()

    guadagni = [{'filiale_proponente': row['filiale_proponente'], 'guadagno_vendite': row['guadagno_vendite'], 'guadagno_affitti': row['guadagno_affitti']} for row in result]
    return jsonify(guadagni)


if __name__ == '__main__':
    app.run(debug=True, port=5001)



