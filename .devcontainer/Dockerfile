# definicao de imagem
FROM maven:3.9-eclipse-temurin-21-noble

# desabilita a instalacao interativa
ENV DEBIAN_FRONTEND=noninteractive

# instala as ferramentas que nao existem na imagem base
# remove os arquivos temporarios depois disso, provenientes do processo de instalacao

# apt-get update atualiza o repositorio de software
#  apt-get install -y - instala as ferramentas e o -y são os "sim" das ferramentas

RUN apt-get update && apt-get install -y \
    mysql-server-8.0 \
    # git - trata texto
    git \
    # git-lfs - trata binarios
    git-lfs \
    # curl - baixar arquivos da internet e teste de api
    curl \
    # unzip - descompacta
    unzip \
    # zip - compacta
    zip \

    # limpa arquivos temporarios
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*
