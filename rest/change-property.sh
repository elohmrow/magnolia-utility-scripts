#!/bin/bash

curl http://localhost:8080/.rest/nodes/v1/contacts/vvangogh \
-H "Content-Type: application/json" \
-X POST -i \
--user superuser:superuser \
--data \
'{
"properties": [
	{ 
       	"name": "country", 
        "type": "String", 
        "multiple": false, 
        "values": [
           "Merica" 
        ]
    }
   ] 
}'
