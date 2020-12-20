# GraphQLGuestbook

## Implementation details
* Spring Framework
* GraphQL
* Apache Maven
* Lombok

## GraphiQL Interface
### Path:
/graphiql

###Create message mutation:
mutation {<br>
&nbsp;&nbsp;&nbsp;&nbsp;createMessage(author: "NAME", text: "TEXT") {<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id<br>
&nbsp;&nbsp;&nbsp;&nbsp;}<br>
}<br>

###Get message query:
query {<br>
&nbsp;&nbsp;&nbsp;&nbsp;messages(count: 2) {<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;author,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;text,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;creationDate<br>
&nbsp;&nbsp;&nbsp;&nbsp;}<br>
}<br>