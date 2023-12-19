import { ApolloClient, InMemoryCache } from "@apollo/client";

const client = new ApolloClient({
  uri: "URL_DE_TU_SERVIDOR_GRAPHQL",
  cache: new InMemoryCache(),
});

export default client;
