SFML_PATH = /opt/homebrew/opt/sfml@2

SRC = $(shell find . -name "*.cpp")

all: build run

build:
	mkdir -p bin
	clang++ -std=c++17 $(SRC) \
	-I$(SFML_PATH)/include \
	-L$(SFML_PATH)/lib \
	-lsfml-graphics -lsfml-window -lsfml-system -lsfml-audio \
	-o bin/app

run:
	./bin/app