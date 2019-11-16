import axios from "axios";

const api = axios.create({
    baseURL: 'http://localhost:9000',
    timeout: 1000,
    headers: {'Access-Control-Allow-Origin': 'http://localhost:8080/',
    'Access-Control-Allow-Methods': 'POST,GET,PUT,DELETE',
    'Access-Control-Allow-Headers': 'Authorization, Lang'}
  });

export default {
    orderByLevel(level) {
        api.get(`/log/level/${level}`)
            .then((data) => {console.log(data)})
            .catch((error) => {console.log(error)});
    }
}
