---
name: new-day
description: Use when user wants to create a new Day-NN module, start a new coding day, or add a new Java practice module to this project.
---

# New Day Module

## Overview
在当前 Java 学习项目中创建新的 Day-NN 模块，自动生成标准结构。

## Process

### 1. 确认信息
问用户（一次一个）：
- 模块编号（如 27）
- 学习主题（如 "IO 流"）

### 2. 生成文件
```
Day-27/
  Day-27.iml
  src/
    Main.java
    pers/cjw/<topic>/
```
- `Main.java` 含 `package pers.cjw.<topic>; public class Main { ... }`
- `.iml` 复制已有模块格式，替换模块名
- 包名将主题转为驼峰小写：IO流 → `iostream`，多线程 → `multithread`

### 3. 注册模块
在 `.idea/modules.xml` 中添加新模块的 `<module>` 条目。

## Rules
- 不创建 Day-17（已有缺口，用户跳过了）
- .iml 文件内容参照 Day-26 或其他已有模块

## Example
```
用户：创建 Day-27，学 IO 流
→ Day-27/src/pers/cjw/iostream/Main.java
→ Day-27/Day-27.iml
→ .idea/modules.xml 更新
```
