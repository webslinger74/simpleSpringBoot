echo 'creating image from dockerFile'
echo '$whoami'

docker build --tag stevens-react-in-docker .

echo 'starting container'

docker run -p 8081:8081 -p 443:443 stevens-react-in-docker
