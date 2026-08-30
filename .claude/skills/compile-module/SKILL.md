---
name: compile-module
description: Use when user wants to compile one or more Java modules, check for compilation errors, or verify code changes compile cleanly. Use for single module or batch compile of all modules.
---

# Compile Module

## Overview
编译指定模块的 Java 文件，报告通过/失败及错误详情。

## Process

### 单个模块
```bash
javac -d $PROJECT_ROOT/out/<module> -encoding UTF-8 \
  $(find $PROJECT_ROOT/<module>/src -name "*.java") 2>&1
```

### 全部模块
遍历所有模块目录（Day-02 到 Day-26、Sort、HuaweiODTest），逐个编译并统计。

## Output Format
- ✅ `<module>` (N files) - OK
- ❌ `<module>` (N files) - X errors（附具体错误信息）

## Notes
- Day-18 依赖外部 Gson jar，预期会因缺依赖而失败，非代码问题
- 编译输出到 `out/<module>/`，已被 .gitignore 排除
- 项目 JDK 21，编码 UTF-8
