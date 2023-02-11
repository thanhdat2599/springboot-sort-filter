# Payload testing
```
{
    "filters": [
        {
            "key": "name",
            "operator": "LIKE",
            "fieldType": "STRING",
            "value": "name 1"
        }
    ],
    "sorts": [
        {
            "key": "id",
            "direction": "ASC"
        }
    ],
    "page": null,
    "size": null
}
```

````
{
"filters": [
{
"key": "name",
"operator": "IN",
"fieldType": "STRING",
"values": ["name 1", "name 2"]
}
],
"sorts": [],
"page": null,
"size": null
}

````
``````
{
"filters": [
{
"key": "createdDate",
"operator": "BETWEEN",
"fieldType": "DATE",
"value": "07-02-2023 09:27:50",
"valueTo": "09-02-2023 09:27:50"
}
],
"sorts": [],
"page": null,
"size": null
}


