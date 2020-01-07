package com.simple01.tree;

/**
 * @author Song Yinghui
 * @date 2020/1/6
 * @Version 1.0
 *
 * 字典树
 */
public class TrieTree {

    private TrieNode root ;

    static class TrieNode{

        public boolean endWord ;

        public Character val ;

        public TrieNode[] childers = new TrieNode[26];

        public TrieNode(){}

        public TrieNode(Character val){
            TrieNode node = new TrieNode();
            node.val = val ;
        }
    }

    public TrieTree(){
        root = new TrieNode();
        root.val = ' ';
    }

    public void add(String str){
        TrieNode cur = root;
        for (int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if (cur.childers[c - 'a'] == null){
                cur.childers[c - 'a'] = new TrieNode(c);
            }
            cur = cur.childers[c - 'a'] ;
        }
        // for 循环结束代表 该单词所有字母都已录入树中，且是一个单词
        cur.endWord = true ;
    }

    // 查询单词是否 已经录入
    public boolean search(String str){
        TrieNode cur = root ;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (cur.childers[c - 'a'] == null){
                return false;
            }
            cur = cur.childers[c - 'a'];
        }
        return cur.endWord;
    }

    // 判断单词是否前缀
    public boolean searchWith(String str){
        TrieNode cur = root ;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (cur.childers[c - 'a'] == null){
                return false;
            }
            cur = cur.childers[c - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        TrieTree trieTree = new TrieTree();
        trieTree.add("hello");
        System.out.println(trieTree.search("hellor"));
    }
}
