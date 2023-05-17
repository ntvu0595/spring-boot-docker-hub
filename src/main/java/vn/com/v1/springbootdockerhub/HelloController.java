package vn.com.v1.springbootdockerhub;

import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.pdf.BaseFont;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import fr.opensagres.xdocreport.converter.*;
import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.core.document.DocumentKind;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.images.ByteArrayImageProvider;
import fr.opensagres.xdocreport.document.images.IImageProvider;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.itext.extension.font.IFontProvider;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import fr.opensagres.xdocreport.template.formatter.NullImageBehaviour;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.*;

/*******************************************************************************
 * @Class           ：HelloController
 * @since           ：4/4/2023 3:05 PM
 * @Author          ：Zephyrus-PC
 * @ChangeLog       ：4/4/2023 3:05 PM Zephyrus-PC create a new
 * @version         : 1.0
 ******************************************************************************/
@RestController
@RequestMapping("/rest")
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);
    /**
     * This is about <code>HelloController.java</code>.
     *
     * @return <code></code>
     * @author VuNT
     * @description use <code></code>
     * @since 4/5/2023 5:03 PM
     */
    @GetMapping("/get")
    public String hello() throws IOException {
        System.out.print("LMA");
        logger.info("Hello open my log");
//        String docxFileName = "E:\\DocExport.docx";
//        String pdfFileName = "E:\\Document.pdf";
//        convertWordToPdf(docxFileName, pdfFileName);
//        SaasAuthentication sa = new SaasAuthentication("-_i1y81UJj42YKt1olKUcqNCUrEnD46j",
//                ".Itdb2YTn9JD3u1MO0l4UvUoHF5y4f-lr~S.QWFL5VaYv.nI5x0zkk8G3j7wHxci");
//        CamundaTaskListClient client = new CamundaTaskListClient.Builder().authentication(sa)
//                .taskListUrl("https://jfk-1.tasklist.camunda.io/8f9ac0c6-2931-4185-82f1-759f9724e245").build();
//        TaskList tasks = client.getTasks(true, TaskState.CREATED, 50);
//        //        https://jfk-1.tasklist.camunda.io/8f9ac0c6-2931-4185-82f1-759f9724e245
//        tasks = client.getTasks(true, TaskState.CREATED, 100);
//
//        List<String> group = new ArrayList<>();
//        group.add("mariovunguyen@gmail.com");
//        group.add("ntvu0595@gmail.com");
//        for (Task task : tasks) {
//            //assign task to paul
//            client.claim(task.getId(), "paul13");
//        }
        return "Helaos";
    }

//    private void convertWordToPdf(String docxFileName, String pdfFileName) throws IOException {
//        File tempFileDocx = File.createTempFile("DocExport", ".docx");
//        try (InputStream docxInputStream = new FileInputStream(docxFileName);) {
//            IXDocReport ixDocReport = XDocReportRegistry.getRegistry().loadReport(docxInputStream,
//                    TemplateEngineKind.Velocity);
//            IContext context = ixDocReport.createContext();
//            FieldsMetadata metadata = ixDocReport.createFieldsMetadata();
//
//            context.put("testtingData", "test data");
//
//            try (FileOutputStream fileOutputStream = new FileOutputStream(tempFileDocx)) {
//                ixDocReport.process(context, fileOutputStream);
//                XDocReportRegistry.getRegistry().unregisterReport(ixDocReport);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (XDocReportException e) {
//            throw new RuntimeException(e);
//        }
//        if (StringUtils.equals("PDF", "PDF")) {
//
//            try (OutputStream outputStream = new FileOutputStream(pdfFileName)) {
//                Options options = Options.getFrom(DocumentKind.DOCX).to(ConverterTypeTo.PDF);
//                PdfOptions pdfOptions = PdfOptions.create();
//                options.subOptions(pdfOptions);
//                IConverter conversor = ConverterRegistry.getRegistry().getConverter(options);
//                FileInputStream inputStreamConvert = new FileInputStream(tempFileDocx);
//                try {
//                    if (null != conversor) {
//                        conversor.convert(inputStreamConvert, outputStream, options);
//                    }
//                    outputStream.flush();
//                } catch (XDocConverterException | IOException e) {
//                } finally {
//                    inputStreamConvert.close();
//                    outputStream.close();
//                }
//            }
//        }
//    }
}
