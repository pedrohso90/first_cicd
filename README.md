# CICD Initials

* pre reqs: docker swarm

## create network docker
<i>docker network create --driver overlay cicd</i>

## build image and deploy jenkins stack cicd
<i>docker build -t jenkins:0.0.1 -f Dockerfile .</i><br>
<i>docker stack deploy -c jenkins.yml cicd</i>

## deploy sonar stack cicd
<i>docker stack deploy -c sonar.yml cicd</i>

## steps create cicd
* access http://localhost:8080 <b>Jenkins</b>
* install plugins
* create user and login
* Jenkins OK
* create first job type pipeline
* in pipeline script add script <i>pipeline.groovy</i>
* access http://localhost:9000 <b>Sonar</b>
* login user admin/admin
* create token in profile user
* in jenkins edit job, add token in pipeline script
* execute job