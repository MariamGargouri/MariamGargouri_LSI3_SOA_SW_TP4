package server;
import jakarta.xml.ws.Endpoint;// Importe la classe Endpoint du package jakarta.xml.ws pour gérer la publication du service web.
import service.CalculatriceWS;// Importe la classe CalculatriceWS du package service pour définir le service web.
public class ServerJWS {
    public static void main(String[] args)
    {
        String url ="http://localhost:8084/";// Définit l'URL à laquelle le service web sera publié.
        Endpoint.publish(url,new CalculatriceWS());// Publie le service web à l'URL spécifiée en utilisant la classe CalculatriceWS pour implémenter le service.
    System.out.println(url);// Affiche l'URL du service web publié sur la console.

    }
}
