# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.12

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /snap/clion/37/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /snap/clion/37/bin/cmake/linux/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/flags.make

CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.o: CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/flags.make
CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.o   -c /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/main.c

CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/main.c > CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.i

CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/main.c -o CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.s

# Object files for target listasDuplamenteEncadeadasCirculares
listasDuplamenteEncadeadasCirculares_OBJECTS = \
"CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.o"

# External object files for target listasDuplamenteEncadeadasCirculares
listasDuplamenteEncadeadasCirculares_EXTERNAL_OBJECTS =

listasDuplamenteEncadeadasCirculares: CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/main.c.o
listasDuplamenteEncadeadasCirculares: CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/build.make
listasDuplamenteEncadeadasCirculares: CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable listasDuplamenteEncadeadasCirculares"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/build: listasDuplamenteEncadeadasCirculares

.PHONY : CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/build

CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/cmake_clean.cmake
.PHONY : CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/clean

CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/depend:
	cd /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/cmake-build-debug /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/cmake-build-debug /home/marco/projetos/codigos-ed/c/listasDuplamenteEncadeadasCirculares/cmake-build-debug/CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/listasDuplamenteEncadeadasCirculares.dir/depend

