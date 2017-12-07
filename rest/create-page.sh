#!/bin/bash

curl http://localhost:8080/.rest/nodes/v1/website/ \
-H "Content-Type: application/json" \
-X PUT -i \
--user superuser:superuser \
--data \
'{
  "name": "hello",
  "type": "mgnl:page",
  "path": "/hello",
  "properties": [
    {
      "name": "title",
      "type": "String",
      "multiple": false,
      "values": [
        "Hello REST"
      ]
    },
    {
      "name": "mgnl:template",
      "type": "String",
      "multiple": false,
      "values": [
        "mtk:pages/basic"
      ]
    }
   ]
}'
