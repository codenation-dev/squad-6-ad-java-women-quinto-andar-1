import axios from "axios";

const api = axios.create({
    baseURL: 'https://loglabproject.herokuapp.com/',
    timeout: 2000,
  });

export default {
    login(email, password) {
        return api.post(`login/authenticate`, {
            data: {
                "email": email,
                "password": password
            }
        })
            .then((res) => {return res.data})
            .catch((res) => {console.log(res)});
    },
    orderByLevel() {
        return api.get(`/log/orderLevel`)
            .then((res) => {return res.data})
            .catch((res) => {console.log(res.error)});
    },
    getLog(id) {
        return api.get(`/log/${id}`)
            .then((res) => {return res.data})
            .catch((res) => {console.log(res.error)});
    }
}