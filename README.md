# CICD Initials

## create network docker
<i>docker network create --driver overlay cicd</i>

## deploy jenkins stack cicd
<i>docker stack deploy -c jenkins.yml cicd</i>

## deploy sonar stack cicd
<i>docker stack deploy -c sonar.yml cicd</i>