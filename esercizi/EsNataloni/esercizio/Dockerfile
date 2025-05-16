FROM python:3.9-slim

WORKDIR /server

COPY requirements.txt .
RUN pip install -r requirements.txt

COPY . /server 

EXPOSE 5004

CMD ["python3", "server.py"]