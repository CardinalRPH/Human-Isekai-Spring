# SU API Specs

## Login Su

Endpoint : DELETE /api/su/login

Request Body :

```json
{
  "userName": "Namex",
  "password": "String Dayo"
}
```

Response Body (Success) :

```json
{
  "data": {
    "superName": "Waganawa Megumin",
    "token": "TheTokens"
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Create SU

Endpoint : POST /api/su

Request Body :

```json
{
  "userName": "Namex",
  "superName": "Waganawa Megumin",
  "password": "String Dayo"
}
```

Response Body (Success) :

```json
{
  "data": {
    "userName": "Namex",
    "superName": "Waganawa Megumin"
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Patch Su

Endpoint : PATCH /api/su

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "superName": "Waganawa Megumin",
  "password": "String Dayo"
}
```

Response Body (Success) :

```json
{
  "data": {
    "userName": "Namex",
    "superName": "Waganawa Megumin"
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Get Su

Endpoint : GET /api/su/{userName}

Response Body (Success) :

```json
{
  "data": {
    "superName": "Waganawa Megumin"
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Delete Su

Endpoint : DELETE /api/su

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "userName": "Namex"
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
