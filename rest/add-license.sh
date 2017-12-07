#!/bin/bash

# You can add only one node per request. You cannot PUT nested nodes.

curl http://localhost:8080/.rest/nodes/v1/modules/ \
-H "Content-Type: application/json" \
-X POST -i \
--user superuser:superuser \
--data \
'{
  "name": "license",
  "type": "mgnl:contentNode",
  "path": "/enterprise/license",
  "properties": [
    {
      "name": "owner",
      "type": "String",
      "multiple": false,
      "values": [
        "training@magnolia-cms.com"
      ]
    },
    {
      "name": "key",
      "type": "String",
      "multiple": false,
      "values": [
        "LS0tLS1CRUdJTiBQR1AgTUVTU0FHRS0tLS0tClZlcnNpb246IEJDUEcgdjEuNDYKCm93SjRuSnZBeTh6RXhMaDQ4eU9HcFluL3RSbFA3MG5pemszUHk4bkpURTdOSzA2TmZQZDNtbkpJYWFxQ2YzS0oKZ3BHSmdxR0JsWW1wbGFHQmdyTnJjSWlDa1lHaE9WZFphbEZ4Wm41ZXNXMjBxWjZCbm9HT0dZaU01c292ejBzdApzaTBwU3N6TXk4eExkOGhOVE0vTHo4bE0xRTNPTGRaTHpzL2xTcTBveUN4S0xBSHF0QVVhWTZGcllLaHJiTWlWCm01OVNtcE5hYkp1YVY1SmFWRkNVV1p6S2xacVNXUUkySHlHbVcxQ1VuNVphRExJMk1VY0hTVzNISEJZbVJpWUcKTmxZbWtNTVp1RGdGWUI0N1VzYjh6NXBYNUVRNWI2eGlEYWRka1NGWGZtalRYK2JkeTFSVytlc3dubDlqdGxBbAo0MEZxdWJwUy9KbUtUODk2cXY0WnRnaVZXenJjTGE1NzRXQ3hLZkp2ME5YNW4xM0Q3eWhzL20yZHVuTEo0Ym9XCmRxNXFENUZ0NzdidERkR1o3eHZCczkydHk2Yjl0b0YrSDBORGJPSkozNm5PT3JybXVSV0NKMlhtM2xaN1BLVnMKYW1lSzRoRUFieDJMbXc9PQo9TGFwMAotLS0tLUVORCBQR1AgTUVTU0FHRS0tLS0tCg=="
      ]
    }
      ]
    }'
