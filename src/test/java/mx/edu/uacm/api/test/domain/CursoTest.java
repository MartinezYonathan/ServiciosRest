/**
 * 
 */
package mx.edu.uacm.api.test.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.edu.uacm.api.ServiciosRestApplication;
import mx.edu.uacm.api.domain.Curso;
import mx.edu.uacm.api.persistencia.CursoRepository;

/**
 * @author christian
 *
 */
/*anotaciones*/
@RunWith(SpringRunner.class)//y se importa
@SpringBootTest(classes = ServiciosRestApplication.class)//le paso mi clase 
//con la que voy a comenzar a ejecutar
//la aplicaciÃ³n en este caso se llama ServiciosRestApplication, se debe importar
public class CursoTest {
	//Estamos utilizando Test Driven Development(TDD Desarrollo guiado por pruebas), nos recomienda que debemos
	//iniciar desarrollando pruebas
	//y estamos tratando de 
	//no repertir las operaciones CRUD
	//COMENZAMOS CON LA PARTE DE LA BASE DE DATOS
	private static final Logger log=LogManager.getLogger(CursoTest.class);
	//private static final Logger log = Logger.get getLog(CursoTest.class);
	//el logger se importa el de apache
	@Autowired //utilizamos la inyecciÃ³n de dependencias para inyectar 
	//la implemetaciÃ³n de la interfaz
	CursoRepository cursoRepository;// es una interfaz 
	//el primer test 
	@Test  //se importa el de junit
	public void testGuardarCurso()
	{log.debug("Entrando al metodo testGuardarCurso");
		
		Curso curso= new Curso();
		curso.setNombre("mi primer curso");
		curso.setDescripcion("curso inicial");
		
		//recuerda que estamos usando una BD h2 = en memoria
		cursoRepository.save(curso);//guardamos un curso en la base de datos
	}
	
}