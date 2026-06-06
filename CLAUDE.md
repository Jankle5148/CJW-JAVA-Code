# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a personal Java learning repository. It has no Maven/Gradle build system — it is an IntelliJ IDEA project (`.idea/`, `.iml`). Each module is listed in `.idea/modules.xml`.

## Project Structure

Each `Day-NN/` directory is a self-contained IntelliJ module with its own `src/` folder. The package convention is `pers.cjw.<topic>`. Most days have a `Main.java` entry point plus demo/practice classes and manual test classes under sub-packages.

Additional directories:
- `Sort/` — sorting algorithm implementations (bubble, selection, insertion, shell, merge sort)
- `HuaweiODTest/` — Huawei OD exam practice problems (uses `jikao` and `shousi` packages, not `pers.cjw.*`)
- `LeetCode/` — referenced in `modules.xml` but directory does not exist yet
- `src/` — top-level Main.java (simple Hello World)
- `out/` — compiled `.class` output (gitignored)

Note: There is no Day-17 directory (gap between Day-16 and Day-18).

## Build & Run

Since this is a pure IntelliJ project with no build tool:
- **Compile & run**: Open in IntelliJ IDEA, right-click any `Main.java` → Run.
- Each `Day-NN/src/` folder must be marked as a sources root individually (already configured in `.idea/modules.xml`).
- **JDK**: Uses inherited JDK from the IDE (no pinned version in project files).
- Compiled output goes to the project-level `out/` directory.

There is no test framework (no JUnit). Classes named `Test.java` or `*Test*.java` are manual demos with their own `main` methods.

## Coding Topics by Day

| Days | Topics |
|------|--------|
| Day-02–03 | Basics, arithmetic operators |
| Day-04–05 | Control flow (if, switch, for, while), arrays, loop control |
| Day-06–07 | Methods, practice exercises |
| Day-08–09 | OOP (classes, objects, encapsulation, JavaBeans, project exercises) |
| Day-10–11 | Java API (Scanner, String, StringBuilder, ArrayList) |
| Day-12 | Student management system project |
| Day-13 | Static, inheritance |
| Day-14 | Polymorphism, packages, final, permissions, code blocks |
| Day-15 | Abstract classes, interfaces, inner classes |
| Day-16 | Additional practice / review |
| Day-18 | API utilities (Runtime, Object, Objects, Cloneable, BigInteger, BigDecimal, Date) |
| Day-19 | Regex API (Pattern, Matcher) |
| Day-20 | API (Integer, String, StringBuilder, Math, System, Runtime) |
| Day-21 | API (Date, SimpleDateFormat, Calendar, JDK8 time classes, packaging) |
| Day-22 | Collections framework (ArrayList, LinkedList, List, data structures) |
| Day-23 | Generics, Set (HashSet, LinkedHashSet, TreeSet) |
| Day-24 | Map (HashMap, LinkedHashMap, TreeMap), source code walkthrough |
| Day-25 | Varargs, Collections utility class, DouDiZhu card game project |
| Day-26 | Lambda, method references, Stream API |
| Sort | Sorting algorithms (bubble, selection, insertion, shell, merge) |
| HuaweiODTest | Algorithmic exam problems (jikao = machine test, shousi = interview) |
