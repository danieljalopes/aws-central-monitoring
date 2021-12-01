Number Generator

This intends to be an exercise about Docker, Docker Compose and K8s.
The application "Generator" will generate numbers that appear in logs.
The number generation is triggered by other REST application called "Service". The "Service" will call a REST service on "Generator", that will create a new thread that starts integer generation. Those numbers are seen on logs.

## Folder central_log
Has a docker-compose file to launch the centralized log system.
Fluentd collects logs and send them to Elasticksearch. Logs can be seen 
Prometheus collects metrics. Metrics can be seen by Grafana

## How to Run
1. Start Central Logging
   1. Go to folder central_log
   2. run 
    ```
   docker-compose build
   docker-compose up -d
   ```
2. Start service "Generator"
3. Start service "Service"

## How to use
