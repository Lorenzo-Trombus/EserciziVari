import pandas as pd
import numpy as np
from sqlalchemy import create_engine, text
from sqlalchemy.exc import SQLAlchemyError
import json
import matplotlib.pyplot as plt
from typing import Tuple


class DataSourceConfig:
    db_uri: str ="postgresql+psycopg://postgres:postgres@postgresql:5432/retail_db"
    csv_customer_path: str = "../../dati/retail/customer.csv"
    csv_product_path: str= "../../dati/retail/product.csv"
    csv_transaction_path: str="../../dati/retail/transaction.csv"

class DataPipeline:
    def __init__(self, config: DataSourceConfig):
        self.config = config
        self.data = None
        
    def load_from_csv(self) -> pd.DataFrame:
        """Carica dati da un file CSV"""
        df = pd.read_csv(self.config.csv_path)
        return df
    
    def load_from_excel(self) -> pd.DataFrame:
        """Carica dati da un file Excel"""
        return pd.read_excel(self.config.excel_path)

    def load_from_database_one(self) -> pd.DataFrame:
        """Carica dati da una tabella di un database"""        
        df = pd.DataFrame()
        return df
    
    def load_from_database_two(self) -> Tuple[pd.DataFrame, pd.DataFrame]:
        """Carica dati da due tabelle di un database"""
        df1 = pd.DataFrame()
        df2 = pd.DataFrame()
        return df1, df2




    def run_pipeline(self) -> pd.DataFrame:
        """Esegui la pipeline di analisi dati"""    
        csv_df = self.load_from_csv()
        print("   Letti dati da un file CSV") 
        cleaned_df = self.preprocess_data(csv_df)
        print("   Pre-processamento e pulizia dati completati")
        return(cleaned_df)

if __name__ == "__main__":
    config = DataSourceConfig() 
    # Esegui la pipeline
    pipeline = DataPipeline(config)
    print("Pipeline avviata...")
    final_df = pipeline.run_pipeline()
    print("Pipeline completata con successo!")
    # print(final_df.head())

