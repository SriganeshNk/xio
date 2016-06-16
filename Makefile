.PHONY: clean compile xio/log xio/core xio/ssl xio/server xio/client/asyncretry xio/client/retry xio/client/lb/strategies xio/client/lb xio/client xio/mux xio/proxy

all: xio/log xio/core xio/ssl xio/server xio/client/asyncretry xio/client/retry xio/client/lb/strategies  xio/client/lb xio/client xio/mux xio/proxy

PROJECT_ROOT=$(shell pwd)
export TARGETDIR := $(PROJECT_ROOT)/target

include Classpath.mk
include Dependencies.mk

repl:
	@echo $(MAVEN_CLASSPATH) | sed -e 's/^/:/' | sed -e 's/:/|:cp /g' | tr '|' '\n'
	@echo
	@javarepl

fetch:
	@coursier fetch --verbose $(DEPS_ALL)

checkstyle:
	java -Dcheckstyle.cache.file=checkstyle.cache -cp `coursier fetch -p $(DEPS_ALL)` com.puppycrawl.tools.checkstyle.Main -c checkstyle.xml src/main

target:
	mkdir -p target

clean:
	rm -fr target

compile: target
	scripts/run-compile $$(find src/main -name "*.java")

xio/core: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/core

xio/client: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/client

xio/client/lb/strategies: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/client/loadbalancer/strategies

xio/client/lb: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/client/loadbalancer

xio/client/asyncretry: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/client/asyncretry

xio/client/retry: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/client/retry

xio/server: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/server

xio/ssl: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/SSL

xio/log: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/log

xio/mux: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/mux

xio/proxy: target
	$(MAKE) -C src/main/java/com/xjeffrose/xio/proxy

test:
	java -cp lib/*.jar org.junit.runner.JUnitCore src/test/com/xjeffrose/xio/*.java

jar:
	jar cvf test.jar target/test/mod1/*.class target/test/mod2/*.class target/chica/*.class
	jar cfe test.jar test.Main.main target/test/Main.class
