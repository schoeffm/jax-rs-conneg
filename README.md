# Build
mvn clean package && docker build -t schoeffm/conneg .

# RUN

docker rm -f conneg || true && docker run -d -p 8080:8080 -p 4848:4848 --name conneg schoeffm/conneg 