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

## Creating a NSFW account

    POST /nsfw/users

```json
{
    "userId": "...",
    "username": "...",
    "email": "..."
}
```

*Returns*

```json
{
    "nsfwUserId": "..."
}
```

## Logging out of a NSFW account

    DELETE /nsfw/users/:userId

*Returns*

```json
{
    "redirectUrl": "..."
}
```
