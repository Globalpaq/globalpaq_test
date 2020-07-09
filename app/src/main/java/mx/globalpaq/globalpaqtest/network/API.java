package mx.globalpaq.globalpaqtest.network;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class API {

    /**
     * Utilizaremos un singleton para realizar el consumo del API
     * con ayuda de la libreria de Volley, si no sabes como usar esta libreria
     * sientete libre de usar el metodo de tu preferencia siempre y cuando utilizes
     * Singleton pattern para relizar las llamadas a la API.
     *
     * Suerte y happy coding
     */
    //Base url
    public static final String API_URL_BASE = "https://sistema.globalpaq.mx/api/v2/public";

    //Context para las peticiones
    private static Context ctx;

    //Cola de peticiones
    private static RequestQueue queue;

    private API(){}

    private static class APIHelper{
        private static final API INSTANCE = new API();
    }

    public static void init(Context context){
        if (ctx != null) return;
        ctx = context;
        queue = Volley.newRequestQueue(context);
    }

    public static API getInstance(){
        return APIHelper.INSTANCE;
    }

    //TODO : Implementa el consumo del API atraves del singleton

}
