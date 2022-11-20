<h1 align="center"><img src="https://user-images.githubusercontent.com/63134747/202898393-4f9e341d-de9f-4509-9258-8954841575e9.svg" width="150"><b> DSMeta</b></h1>

<div align="center">

![alt](https://img.shields.io/badge/java-v17-red?style=flat&logo=coffeescript)
![alt](https://img.shields.io/badge/spring-v2.7.5-green?style=flat&logo=spring)
![alt](https://img.shields.io/badge/npm-v8.19.2-red?style=flat&logo=npm)
![alt](https://img.shields.io/badge/yarn-v1.22.19-blue?style=flat&logo=yarn)
![alt](https://img.shields.io/badge/node-v16.18.1-green?style=flat&logo=nodedotjs)
![alt](https://img.shields.io/github/languages/count/lucasferreiraz/dsmeta)

</div>

<h1 align="center"><img src="https://user-images.githubusercontent.com/63134747/202898726-6c50c16f-beec-4aae-93a9-946361198f58.png"></h1>

## About 📚

The **DSMeta** project was developed during the **11th Edition of DevSuperior's Spring React Week** event. During the course, the basic concepts of the **Spring framework** were covered in the construction of endpoints of a **Rest API** in the **backend** and the **React** base in the composition of the **frontend**, putting everything into practice in the development of this project, **DSMeta**. A fictional service that lists sales with SMS notification.



## Technologies Used 🚀

- **Java**
- **Spring**
- **Maven**
- **JPA / Hibernate**
- **H2 Database**
- **React JS**
- **TypeScript**
- **Axios**

## Endpoints 🔗

For this project two endpoints were designed (click to expand): <br>

<details>

<summary><b>Show Sellers:</b> <code>GET localhost/sales</code></summary>
## Show Paginated Sellers List

Returns an object containing a paginated list of the top 20 sellers in the database if the date range is not passed as a parameter in the endpoint call.

**Method** : `GET`

**URL** : `localhost/sales`

### OR

**URL** : `localhost/sales/?minDate=yyyy-MM-dd&maxDate=yyyy-MM-dd`

## Success Response

**Code** : `200 OK`

**Content example:**

```json
{
    "content": [
        {
            "id": 37,
            "sellerName": "Padme",
            "visited": 82,
            "deals": 82,
            "amount": 22465.0,
            "date": "2022-02-27"
        },
        
        "."
        "."
        "."
        
        
        {
            "id": 26,
            "sellerName": "Kal-El",
            "visited": 21,
            "deals": 20,
            "amount": 17126.0,
            "date": "2022-04-03"
        },
        {
            "id": 25,
            "sellerName": "Anakin",
            "visited": 68,
            "deals": 43,
            "amount": 17016.0,
            "date": "2022-04-07"
        }
    ],
    "pageable": {
        "sort": {
            "sorted": false,
            "empty": true,
            "unsorted": true
        },
        "pageNumber": 0,
        "pageSize": 20,
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 4,
    "totalElements": 66,
    "last": false,
    "sort": {
        "sorted": false,
        "empty": true,
        "unsorted": true
    },
    "size": 20,
    "number": 0,
    "numberOfElements": 20,
    "first": true,
    "empty": false
}
```
</details>

<details>

<summary><b>Send Notification:</b> <code>GET localhost/sales/{id}/notification</code></summary>

Send the SMS informing the seller's name, total sales value in the month and the date.

**Method** : `GET`

**URL** : `localhost/sales/{id}/notification`

**Code** : `200 OK`

**Content example:**

<h1 align="center"><img src="https://user-images.githubusercontent.com/63134747/202898938-6916e2a0-84e5-4f23-a40b-08c926a86a4a.png" width="500"></h1>

</details>

---

SMS is sent to the number registered in the Twilio service.

---
<img src="https://user-images.githubusercontent.com/63134747/202898938-6916e2a0-84e5-4f23-a40b-08c926a86a4a.png" width="550">


