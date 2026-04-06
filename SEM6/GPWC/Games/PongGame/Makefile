SFML_PATH = /opt/homebrew/opt/sfml@2

SRC = $(shell find . -name "*.cpp")

all: build run

build:
	mkdir -p bin
	clang++ -std=c++17 -w ./Bat.cpp ./Pong.cpp ./Ball.cpp \
    -I/opt/homebrew/opt/sfml@2/include \
    -L/opt/homebrew/opt/sfml@2/lib \
    -lsfml-graphics -lsfml-window -lsfml-system -lsfml-audio \
    -o bin/app

run:
	./bin/app