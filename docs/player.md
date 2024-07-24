# Player API Specs

## Create Player

Endpoint : POST /api/player

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "jobId": 0123,
  "worldId": 0123,
  "coin": 5000
}
```

Response Body (Success) :

```json
{
  "data": {
    "playerId": 123,
    "firstName": "John",
    "lastName": "Doe",
    "jobId": 0123,
    "coin": 5000
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Patch Player

Endpoint : PATCH /api/player

Request Body :

```json
{
  "playerId": 123,
  "jobId": 0123
}
```

Response Body (Success) :

```json
{
  "data": {
    "playerId": 123,
    "firstName": "John",
    "lastName": "Doe",
    "jobId": 0123,
    "coin": 5000
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Get Player

Endpoint : GET /api/player/{playerId}

Response Body (Success) :

```json
{
  "data": {
    "playerId": 123,
    "firstName": "John",
    "lastName": "Doe",
    "jobId": 0123,
    "itemId": 0123,
    "coin": 5000
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Delete Player

Endpoint : DELETE /api/player

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "playerId": 123
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
