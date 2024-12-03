# Comp Sci Knights Bootcamp: Java

Welcome to the Middle Georgia State University Computer Science student group Java bootcamp.
This project features some Java programming examples and supporting material. The goal of
this bootcamp is to provide foundational knowledge of the Java programming language as well
as give students some industrial insight into software development projects.

## Setup Introduction

Java development is driven by the version of the language being used for any given project. The most common versions
being 8 or greater, 11 or greater, and 17 or greater. All of these versions are marked as Long-term Support (LTS)
releases, which as of this writing means that they will be maintained for three years from the release date.

It is often necessary to have multiple versions of the Java software development kit (SDK) installed on a computer,
since developers may work on projects that require different versions of the language. Therefore, manual
installation/configuration of the Java development environment is not recommended (although, it is possible).

A much better solution for installing and managing Java SDKs is to use an SDK Manager or a Package Manager. There
are a few good options for Linux, macOS, and even Windows.

* Linux
    * _Advanced Packaging Tool (APT)_ for Ubuntu: [APT](https://ubuntu.com/server/docs/package-management)
    * _Yellow Dog Updater, Modified (YUM)_ for Red Hat Enterprise Linux: [YUM](https://www.redhat.com/en/blog/how-manage-packages)
* macOS
    * [Homebrew](https://brew.sh/)
    * [MacPorts](https://www.macports.org/)
* Windows
    * [WinGet](https://learn.microsoft.com/en-us/windows/package-manager/winget/)

A (mostly) operating system agnostic tool for installing/managing SDKs is SDK Manager, A.K.A. [SDKMAN!](https://sdkman.io/).
By using this tool, it is possible to install multiple different versions of Java, as well as a slew of other SDKs, and
switching between different versions is as easy as running a simple command in the terminal. 

## Setup Java Development Environment on Windows

The reason SDKMAN! is _mostly_ OS-agnostic is due to it requiring an extra tool on Windows, the _Windows Subsystem for Linux_
([WSL](https://learn.microsoft.com/en-us/windows/wsl/about)).

To install WSL,

1. Open a PowerShell terminal in administrator mode by right-clicking the PowerShell application
icon and selecting _Run as administrator_.
2. Execute the command: ```wsl --install```

By default, the above command enables the OS features required to run WSL and installs a virtualized, headless version of Ubuntu
(_headless_ meaning no GUI is included, although one can be installed later). Now, commands can be issued in a UNIX terminal,
which is needed for using SDKMAN!.

Reboot the computer and follow the next section.

## Setup Java Development Environment on UNIX-based Systems

Installing SDKMAN! on a UNIX system is very easy.

1. Execute the following command to download/install SDKMAN!: ```curl -s "https://get.sdkman.io" | bash```
    * That command uses a tool called [cURL](https://man7.org/linux/man-pages/man1/curl.1.html) to download the latest version of SDKMAN!
2. Open a new terminal window/tab, or execute the following command to update the user Bash profile: ```source "$HOME/.sdkman/bin/sdkman-init.sh"```
3. To test that SDKMAN! was installed correctly, execute ```sdk version```
    * That command should print an output similar to the following

```text
SDKMAN!
script: 5.18.2
native: 0.4.6
```

Once SDKMAN! is installed and working properly, run the following commands to install the Java Development Kit (JDK)
version 17.

1. ```sdk list java```
    * That command will list all currently available versions of the JDK, ordered by distribution group. For example,
    ```
     Vendor        | Use | Version      | Dist    | Status     | Identifier
     --------------------------------------------------------------------------------
     Java.net      |     | 24.ea.25     | open    |            | 24.ea.25-open       
                   |     | 24.ea.24     | open    |            | 24.ea.24-open       
                   |     | 24.ea.23     | open    |            | 24.ea.23-open       
                   |     | 24.ea.22     | open    |            | 24.ea.22-open       
                   |     | 23           | open    |            | 23-open             
                   |     | 21.0.2       | open    |            | 21.0.2-open
     JetBrains     |     | 21.0.5       | jbr     |            | 21.0.5-jbr          
                   |     | 17.0.12      | jbr     |            | 17.0.12-jbr         
                   |     | 11.0.14.1    | jbr     |            | 11.0.14.1-jbr
     Temurin       |     | 23.0.1       | tem     |            | 23.0.1-tem          
                   |     | 21.0.5       | tem     |            | 21.0.5-tem          
                   |     | 17.0.13      | tem     |            | 17.0.13-tem         
                   |     | 11.0.25      | tem     |            | 11.0.25-tem         
                   |     | 8.0.432      | tem     |            | 8.0.432-tem
    ```
2. Choose the desired JDK version by highlighting a specific Identifier value from the version table (_Temurin v17.0.13_ for this tutorial, but it doesn't really matter), and then run
`sdk install java 17.0.13-tem`
    * SDKMAN! will print a progress report to the screen as it downloads and installs the chosen JDK
3. Once the installation is complete, run the commands `java -version` and `javac -version` - the versions should match. For example,
```text
$ java -version
openjdk version "17.0.13" 2024-10-15
OpenJDK Runtime Environment Temurin-17.0.13+11 (build 17.0.13+11)
OpenJDK 64-Bit Server VM Temurin-17.0.13+11 (build 17.0.13+11, mixed mode)
$ javac -version
javac 17.0.13
```

## Introduction to Java Programming


