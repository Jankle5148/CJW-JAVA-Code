package jikao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] comments = line.split(",");
            Map<Integer, String> maps = new HashMap<>();
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> counter = new Stack<>();
            for (int i = 0; i < comments.length; i += 2) {
                if (!stack.empty()) {
                    counter.push(counter.pop() - 1);
                }
                int amount = Integer.parseInt(comments[i + 1]);
                Integer key = stack.size() + 1;
                if (!maps.containsKey(key)) {
                    maps.put(key, String.valueOf(i));
                } else {
                    maps.put(key, maps.get(key) + "," + i);
                }
                if (amount > 0) {
                    stack.push(i);
                    counter.push(amount);
                } else {
                    while (!counter.empty()) {
                        if (counter.peek() == 0) {
                            stack.pop();
                            counter.pop();
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println(maps.size());
            for (int i = 1; i <= maps.size(); ++i) {
                String[] cnts = maps.get(i).split(",");
                String[] cmts = new String[cnts.length];
                for (int j = 0; j < cnts.length; ++j) {
                    cmts[j] = comments[Integer.parseInt(cnts[j])];
                }
                System.out.println(String.join(" ", cmts));
            }
        }
    }
}
