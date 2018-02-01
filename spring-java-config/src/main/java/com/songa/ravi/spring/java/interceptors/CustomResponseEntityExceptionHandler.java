package com.songa.ravi.spring.java.interceptors;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import com.songa.ravi.spring.java.models.ErrorMessage;
//
//
//@ControllerAdvice
//public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
//	
// //   @SuppressWarnings({ "unchecked", "rawtypes" })
//    @ExceptionHandler(value = Exception.class)
//	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(Exception ex, HttpStatus status, WebRequest request) {
////        String unsupported = "Unsupported content type: " + ex.getContentType();
////        String supported = "Supported content types: " + MediaType.toString(ex.getSupportedMediaTypes());
////        ErrorMessage errorMessage = new ErrorMessage(unsupported, supported);
//    		ErrorMessage errorMessage = new ErrorMessage(400,"bad input");
//        return new ResponseEntity(errorMessage, status);
//    }
//
//}
