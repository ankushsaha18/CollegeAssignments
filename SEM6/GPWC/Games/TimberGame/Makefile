SFML_PATH = /opt/homebrew/Cellar/sfml/3.0.2

cppFileNames := $(shell find . -type f -name "*.cpp")

all: compile

compile:
	mkdir -p bin
	g++ $(cppFileNames) -I$(SFML_PATH)/include -o bin/app -L$(SFML_PATH)/lib \
	-lsfml-graphics -lsfml-window -lsfml-system -lsfml-audio -lsfml-network