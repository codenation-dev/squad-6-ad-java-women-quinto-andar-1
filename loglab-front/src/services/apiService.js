import axios from "axios";

const api = axios.create({
    baseURL: 'http://localhost:9000',
    timeout: 1000,
    headers: {'Access-Control-Allow-Origin': 'http://localhost/',
    'Access-Control-Allow-Methods': 'POST,GET,PUT,DELETE',
    'Access-Control-Allow-Headers': 'Authorization, Lang'}
  });

export default {
    orderByLevel(level) {
        api.get(`/log/level/${level}`)
            .then((res) => {return res.data})
            .catch((res) => {console.log(res.error)});
    }
}