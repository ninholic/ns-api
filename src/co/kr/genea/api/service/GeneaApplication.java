package co.kr.genea.api.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import co.kr.genea.api.service.CustomerResource;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class GeneaApplication extends Application 
{
   private Set<Object> singletons = new HashSet<Object>();

   public GeneaApplication() {
      singletons.add(new CustomerResource());
   }

   @Override
   public Set<Object> getSingletons() {
      return singletons;
   }
}
