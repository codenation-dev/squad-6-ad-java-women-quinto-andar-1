import axios from "axios";

const api = axios.create({
    baseURL: 'http://localhost:9000',
    timeout: 1000,
  });

export default {
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