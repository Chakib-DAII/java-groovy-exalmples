//mkp = new groovy.xml.MarkupBuilder()
mkp.sports {
    baseball{
        teams{
            team 'cardinals'
            team 'cubs'
        }
    }
    football{
        teams{
            team 'rams'
        }
    }
}

mkp.html {
    head{
        title('MarkupBuilder test')
    }
    body{
        h2('my favorite sites')
        ul{
            li 'https://groovy-lang.org'
            li 'https://openjdk.java.net'
            li 'https://www.apache.org'
        }
    }
}