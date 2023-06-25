import axios from 'axios'

// Пользователи, товары, транзации, область блогов\отзывов
// flowstoneConnect -- сделать бекам http://localhost:8080/api/flowApi
const apis = {
    user: {
        list: axios.get('http://localhost:8080/api/users'),
        active: axios.get('http://localhost:8080/api/users/active'),
        inactive: axios.get('http://localhost:8080/api/users/inactive'),
    },
    product: {
        list: axios.get('http//localhost:8080/api/products'),
        licenseKeys: axios.get('http://localhost:8080/api/products/licenses'),
    },
    payments: {
        list: axios.get('http://localhost:8080/api/payments'),
    },
    forum: {
        messages: axios.get('http://localhost:8080/api/forum'),
    }
}

export default apis;