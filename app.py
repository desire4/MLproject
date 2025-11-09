from flask import Flask,request,render_template,jsonify
import numpy as np
import pandas as pd

from sklearn.preprocessing import StandardScaler
from src.pipeline.predict_pipeline import CustomeData,PredictPipeline

application=Flask(__name__)

app = application
@app.route('/predict', methods=['POST'])
def predict():
    data = request.get_json()

    custom_data = CustomeData(
        gender=data['gender'],
        race_ethnicity=data['ethnicity'],
        parental_level_of_education=data['parental_level_of_education'],
        lunch=data['lunch'],
        test_preparation_course=data['test_preparation_course'],
        reading_score = float(data['reading_score']),
        writing_score = float(data['writing_score'])
    )

    df = custom_data.get_data_as_data_frame()
    pipeline = PredictPipeline()
    result = pipeline.predict(df)
    return jsonify({'prediction': float(result[0])})

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)