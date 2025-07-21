FROM gitpod/workspace-full:latest

USER gitpod
     
RUN sudo apt-get update && \
    sudo apt-get install -y --no-install-recommends docker-compose mysql-client locales && \
    sudo apt-get clean && \
    sudo rm -rf /var/lib/apt/lists/*

RUN sudo ln -sf /usr/share/zoneinfo/Asia/Seoul /etc/localtime
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 21-open && \
    sdk default java 21-open"
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install gradle 8.14 && \
    sdk default gradle 8.14"
RUN sudo locale-gen ko_KR.UTF-8 && sudo update-locale LANG=ko_KR.UTF-8 

ENV LANG ko_KR.UTF-8
ENV LANGUAGE ko_KR:ko
ENV LC_ALL ko_KR.UTF-8