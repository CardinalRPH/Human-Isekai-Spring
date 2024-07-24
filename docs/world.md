# World API Specs

## Create World

Endpoint : POST /api/world

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "worldName": "Namex",
  "location": "JP"
}
```

Response Body (Success) :

```json
{
  "data": {
    "worldId": 123,
    "worldName": "Namex",
    "location": "JP"
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Patch World

Endpoint : PATCH /api/world

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "worldId": 123,
  "worldName": "Namex",
  "location": {
    "lat": 0,
    "lng": 0
  }
}
```

Response Body (Success) :

```json
{
  "data": {
    "worldId": 123,
    "worldName": "Namex",
    "location": "JP"
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Get World

Endpoint : GET /api/world/{worldId}

Response Body (Success) :

```json
{
  "data": {
    "worldId": 123,
    "worldName": "Namex",
    "location": "JP"
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Delete World

Endpoint : PATCH /api/world

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "worldId": 123
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
