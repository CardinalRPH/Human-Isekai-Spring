# Job API Specs

## Create Job

Endpoint : POST /api/job

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "jobName": "Excalibur",
  "sallary": 5000
}
```

Response Body (Success) :

```json
{
  "data": {
    "jobId": 123,
    "jobName": "Excalibur",
    "sallary": 5000
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Patch Job

Endpoint : PATCH /api/job

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "jobId": 123,
  "jobName": "Excalibur",
  "sallary": 5000
}
```

Response Body (Success) :

```json
{
  "data": {
    "jobId": 123,
    "jobName": "Excalibur",
    "sallary": 5000
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Get Job

Endpoint : GET /api/job/{jobId}

Response Body (Success) :

```json
{
  "data": {
    "jobId": 123,
    "jobName": "Excalibur",
    "sallary": 5000
  }
}
```

Response Body (Failure) :

```json
{
  "error": "Faillure Exection"
}
```

## Delete Job

Endpoint : PATCH /api/job

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "jobId": 123,
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
