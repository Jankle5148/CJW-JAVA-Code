---
name: review-module
description: Use when user wants a code review of a specific module, asks to check code quality, or wants to find bugs and best practice violations in Java code.
---

# Review Module

## Overview
对指定模块的 Java 代码做代码审查，输出问题清单（带 file:line）。

## 检查清单

### 🔴 严重（逻辑 Bug）
- `&&` vs `||` 逻辑错误
- 条件判断与注释/提示不一致
- 空集合检查后缺少 `return`
- 计算结果未赋值就使用

### 🟡 中等（效率/健壮）
- 同一方法内多次调用遍历查找（应缓存结果）
- `Scanner` 未关闭（资源泄漏）
- 通过实例调用静态方法
- 原始类型（`ArrayList` 无泛型）

### 🔵 轻微（规范）
- 参数名违反驼峰命名
- `== true` / `== false` 冗余
- 缺少 `@Override` 注解

## Output Format
按优先级分组，每条标注 file:line 和修复建议：
```
## 🔴 严重
1. Xxx.java:30 — 具体问题
   → 修复：xxx

## 🟡 中等
...

## 🔵 轻微
...
```

## Notes
- 这是学习项目，代码规范问题指出即可，不需要苛求
- 只审查 `.java` 文件，跳过 `.iml` 和配置文件
