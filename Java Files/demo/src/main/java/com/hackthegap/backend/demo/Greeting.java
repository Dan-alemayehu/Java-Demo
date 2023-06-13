package com.hackthegap.backend.demo;

public class Greeting {
    
    long id;
    String content;

    public Greeting (long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting (long id, String content, String moreContent) {
        this.id = id;
        this.content = content;
    }

    public Greeting (String content, String moreContent, Long id) {
        this.id = id;
        this.content = content;
    }

    public String getContent () {
        return content;
    }

    public long getId () {
        return id;
    }
    
}


// public class Greeting2 {
    
//     long id;
//     String content;

    
    
//     String getContent () {
//         return this.content;
//     }

//     void setContent ( String content) {
//         this.content = content;
//     }

//     long getId () {
//         return this.id;
//     }

//     void setId ( long id) {
//         this.id = id;
//     }



    
// }
