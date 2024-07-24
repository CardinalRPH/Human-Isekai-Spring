# Item API Specs

## Create Item

Endpoint : POST /api/item

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "itemName": "Excalibur",
  "damage": 500,
  "type": "Armour",
  "jobId": 0123
}
```

Response Body (Success) :

```json
{
  "data": {
    "itemId": 123,
    "itemName": "Excalibur",
    "damage": 500,
    "type": "Armour",
    "jobId": 0123
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Patch Item

Endpoint : PATCH /api/item

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "itemId": 123,
  "itemName": "Excalibur",
  "damage": 500,
  "type": "Armour",
  "jobId": 0123
}
```

Response Body (Success) :

```json
{
  "data": {
    "itemId": 123,
    "itemName": "Excalibur",
    "damage": 500,
    "type": "Armour",
    "jobId": 0123
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Get Item

Endpoint : GET /api/item

Response Body (Success) :

```json
{
  "data": {
    "itemId": 123,
    "itemName": "Excalibur",
    "damage": 500,
    "type": "Armour",
    "jobId": 0123
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Delete Item

Endpoint : DELETE /api/item/{itemId}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "itemId": 123
}
```

Response Body (Success) :

```json
{
  "data": "Data Deleted"
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```
