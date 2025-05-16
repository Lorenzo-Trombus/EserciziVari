# from flask import Flask, jsonify, request
# import psycopg2
# from psycopg2 import sql
# import os

# app = Flask(__name__)

# # Configurazione database
# DB_CONFIG = {
#     "host": "localhost",
#      "port": "5432",
#     "dbname": "cielo",
#     "user": "postgres",
#     "password": "postgres"
# }

# # Connessione al database
# def connect_to_db():
#     try:
#         return psycopg2.connect(**DB_CONFIG)
#     except Exception as e:
#         raise RuntimeError(f"Errore durante la connessione al database: {e}")

# # API: Recupera i dati di una tabella specifica
# @app.route('/<string:table_name>', methods=['GET'])
# def get_table_data(table_name):
#     if not table_name.isalpha():  # Validazione semplice per la tabella
#         return jsonify({"error": "Bad Request", "message": "Il nome della tabella non è valido. Usa solo lettere."}), 400

#     try:
#         connection = connect_to_db()
#         cursor = connection.cursor()
        
#         # Verifica se la tabella esiste nel database
#         cursor.execute(f"SELECT to_regclass('{table_name}')")
#         result = cursor.fetchone()
#         if result[0] is None:
#             return jsonify({"error": "Not Found", "message": f"La tabella '{table_name}' non esiste."}), 404
        
#         # Esegui la query per ottenere i dati dalla tabella
#         query = sql.SQL(f"SELECT * FROM {table_name}")
#         cursor.execute(query)
#         rows = cursor.fetchall()
#         columns = [desc[0] for desc in cursor.description]
#         data = [dict(zip(columns, row)) for row in rows]
#         return jsonify(data)
#     except psycopg2.Error as e:
#         return jsonify({"error": "Errore durante la query al database", "details": str(e)}), 500
#     except Exception as e:
#         return jsonify({"error": "Errore generico", "details": str(e)}), 500
#     finally:
#         if cursor:
#             cursor.close()
#         if connection:
#             connection.close()


# @app.route('/api/health', methods=['GET'])
# def health_check():
#     try:
#         connection = connect_to_db()
#         return jsonify({"status": "success", "message": "Connessione al database riuscita."})
#     except Exception as e:
#         return jsonify({"status": "error", "message": str(e)}), 500

# # Gestire errore 404 globale (quando la route non esiste)
# @app.errorhandler(404)
# def not_found(error):
#     return jsonify({"error": "Not Found", "message": "La risorsa richiesta non è stata trovata."}), 404

# # Gestire errore 400 globale (quando la richiesta è malformata)
# @app.errorhandler(400)
# def bad_request(error):
#     return jsonify({"error": "Bad Request", "message": "La richiesta è malformata o contiene dati non validi."}), 400

# # Gestire errore 500 globale (errore server)
# @app.errorhandler(500)
# def internal_error(error):
#     return jsonify({"error": "Internal Server Error", "message": "Errore interno del server. Riprova più tardi."}), 500

# @app.errorhandler(401)
# def unauthorized(error):
#     return jsonify({"error": "Unauthorized", "message": "Richiesta non autenticata"}), 401

# @app.errorhandler(403)
# def forbidden(error):
#     return jsonify({"error": "Forbidden", "message": "Non hai i permessi per entrare."}), 403

# if __name__ == '__main__':
#     port = int(os.getenv('PORT', 5008))
#     app.run(debug=True, host='0.0.0.0', port=5008)



import psycopg2
from psycopg2.extras import RealDictCursor
from flask import Flask, jsonify

app = Flask(__name__)

connessioneDB= {
    "Host": "172.20.116.213",
    "port": "5432",
    "dbname": "Accademia",
    "user": "postgres",
    "password": "postgres"
}

def db_connection():
    try:
        return psycopg2.connect(**connessioneDB, cursor_factory= RealDictCursor)
    except psycopg2.Error as e:
        raise RuntimeError(f"Errore durante la connessione: {str(e)}")
    
@app.route("/1/<string: table_name>", methods= ['GET'])
def tabella_persona(table_name):
    connessione= db_connection()
    cursore= connessione.cursor()
    cursore.execute(f"SELECT * FROM {table_name}")
    risultato= cursore.fetchall()
    cursore.close()
    connessione.close()
    return jsonify(risultato)

@app.route("/2", methods=['GET'])
def tabella_assenze():
    connessione=db_connection()
    cursore= connessione.cursor()
    cursore.execute('SELECT * FROM assenza')
    risultato= cursore.fetchall()
    cursore.close()
    connessione.close()
    return jsonify(risultato)
    





@app.errorhandler(404)
def not_found_error(error):
    return jsonify('C\'è un errore coglione'), 404

@app.errorhandler(500)
def errore_interno_al_server(error):
    return jsonify('Fratello erore interno al server'),500



if __name__ == "__main__":
    app.run(host="0.0.0.0", port = 5004)