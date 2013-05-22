# Polynote Auth

## Creating an Account

    POST /users

```json
{
    "useranme": "...",
    "password": "...",
    "email": "..."
}
```

*Returns*

``json
{
    "userId": "..."
}
```

## Logging out

    DELETE /users/:userId

*Returns*

```json
{
    "redirectUrl": "..."
}
```
