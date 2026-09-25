# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a personal Java learning repository, built as a **Maven multi-module project**. The root `pom.xml` is a parent POM *and* aggregator: it defines the Java version, source encoding, and every dependency/plugin version. Each `Day-NN/` module declares only a `<parent>` reference plus its `artifactId` — no versions, no build config.

## Project Structure

Each `Day-NN/` directory is a self-contained Maven module using the standard layout:

```
Day-NN/
├── pom.xml
└── src/
    ├── main/java/          ← sources; package convention is pers.cjw.<topic>
    └── main/resources/     ← runtime resources (only Day-25 / Day-26 have these)
```

Additional modules:
- `Sort/` — sorting algorithm implementations (bubble, selection, insertion, shell, merge sort)
- `HuaweiODTest/` — Huawei OD exam practice problems (uses `jikao` and `shousi` packages, not `pers.cjw.*`)

Two things that look wrong but aren't:

- There is no Day-17 module (gap between Day-16 and Day-18).
- Many modules have a `Main.java` / `App.java` sitting in the **default package** (no `package` declaration). This compiles and runs fine under Maven. Leave them alone unless asked — named-package classes cannot import default-package classes, so nothing depends on them.

## Build & Run

All commands run from the repository root.

- **Compile everything**: `mvn clean compile`
- **Compile one module**: `mvn -pl Day-25 compile`
- **Package one module**: `mvn -pl Day-25 package`
- **Inspect dependencies**: `mvn -pl Day-18 dependency:tree`
- **Run a class**: `java -cp "Day-NN/target/classes;<deps>" <fully.qualified.ClassName>`

Build settings, all set once in the root `pom.xml` and inherited everywhere:

- **Java 21** via `maven.compiler.release`.
- **Source encoding UTF-8** — required, not optional. The sources are full of Chinese comments and the machine's default locale is `zh_CN`; without this Maven reads them as GBK and compilation breaks.
- **Versions are managed centrally**: JUnit 5 (`junit-bom`) and Gson are declared in the parent's `<dependencyManagement>`. Modules reference them by `groupId`/`artifactId` only.
- **Local Maven repository is `D:\maven_repository`** (set in `D:\maven\apache-maven-3.9.16\conf\settings.xml`), not the default `~/.m2`.

There are no tests yet, but the scaffolding is ready. Every module has an empty `src/test/java` (held in git by a `.gitkeep` — git does not track empty directories), and the root `pom.xml` declares JUnit 5 (`org.junit.jupiter:junit-jupiter`, test scope) in its `<dependencies>`, so **all modules inherit it automatically**. To add a test, just write a `*Test` class under `src/test/java` mirroring the package of the class under test and run `mvn test`. No per-module dependency declaration needed.

Note: many classes carry a `main` method used as a manual self-test shell. When you write real tests for such a class, drop the `main` and test the actual methods instead.

## Resources

Day-25 and Day-26 are Swing mini-games. Their images live under `src/main/resources/...` mirroring the package path, and are loaded via `getClass().getResource("/pers/cjw/...")` — never via relative file paths, so they work regardless of the working directory.

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
| Day-18 | API utilities (Runtime, Object, Objects, Cloneable, BigInteger, BigDecimal, Date) — plus Gson for deep cloning |
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
