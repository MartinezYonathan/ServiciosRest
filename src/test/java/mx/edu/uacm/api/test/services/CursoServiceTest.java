/**
 * 
 */
package mx.edu.uacm.api.test.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.edu.uacm.api.ServiciosRestApplication;
import mx.edu.uacm.api.services.TallerService;

/**
 * @author christian
 *
 */
/* anotaciones */
@RunWith(SpringRunner.class) // y se importa
@SpringBootTest(classes = ServiciosRestApplication.class) // le paso mi clase
public class CursoServiceTest {
	private static final Logger log = LogManager.getLogger(CursoServiceTest.class);
	@Autowired // utilizamos la inyecciÃ³n de dependencias para inyectar
	// la implemetacion de la interfaz
	TallerService tallerService;// es una interfaz

}
