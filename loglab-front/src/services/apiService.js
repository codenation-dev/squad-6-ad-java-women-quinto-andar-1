import axios from "axios";

const api = axios.create({
    baseURL: 'https://loglabproject.herokuapp.com',
    timeout: 5000,
    headers: { 'Content-Type': 'application/json;charset=UTF-8',
                
                 }
});

export default {
    login(email, password) {
        return api.post(`/login/authenticate`, {
                email: email,
                password: password
            }
        )
            .then((res) => { return res.data })
            .catch((error) => { console.log("ERRRR:: ",error.response.data); });
    },
    getLogs() {
        return api.get(`/log/logs`, {
            headers: {
                'x-auth-token': `${window.localStorage.getItem('user:token')}`
            }
        })
            .then((res) => { return res.data })
            .catch((res) => { console.log(res.error) });
    },
    getLog(id) {
        return api.get(`/log/${id}`, {
            headers: {
                'x-auth-token': `${window.localStorage.getItem('user:token')}`
            }
        })
            .then((res) => { return res.data })
            .catch((res) => { console.log(res.error) });
    }
}