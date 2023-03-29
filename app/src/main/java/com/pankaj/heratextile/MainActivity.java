package com.pankaj.heratextile;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;



import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText sellerNameEditText;
    private EditText buyerNameEditText;
    private EditText moreinfo;
    // private EditText date;
    private EditText transporter;
    private EditText gst;
    private Button savePdfButton;
    //    private Button sharePdfButton;
    private ImageView logoImageView;
    private TableLayout tableLayout;
    private EditText a1EditText;
    private EditText a2EditText;
    private EditText a3EditText;
    private EditText a4EditText;
    private EditText a5EditText;
    private EditText a6EditText;
    private EditText a7EditText;
    private EditText a8EditText;
    private EditText a9EditText;
    private EditText a10EditText;


    private EditText b1EditText;
    private EditText b2EditText;
    private EditText b3EditText;
    private EditText b4EditText;
    private EditText b5EditText;
    private EditText b6EditText;
    private EditText b7EditText;
    private EditText b8EditText;
    private EditText b9EditText;
    private EditText b10EditText;
    private EditText c1EditText;
    private EditText c2EditText;
    private EditText c3EditText;
    private EditText c4EditText;
    private EditText c5EditText;
    private EditText c6EditText;
    private EditText c7EditText;
    private EditText c8EditText;
    private EditText c9EditText;
    private EditText c10EditText;


    private static final int REQUEST_CODE = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sellerNameEditText = findViewById(R.id.seller_name);
        buyerNameEditText = findViewById(R.id.buyer_name);
        moreinfo = findViewById(R.id.more_details);
//        date = findViewById(R.id.date);
        transporter = findViewById(R.id.transporter_name);
        gst = findViewById(R.id.gst);
        savePdfButton = findViewById(R.id.convert_button);
//        sharePdfButton = findViewById(R.id.button);
       // logoImageView = findViewById(R.id.logo_image);

        //table
        tableLayout = findViewById(R.id.tableLayout);
        a1EditText= findViewById(R.id.a1EditText);
        a2EditText= findViewById(R.id.a2EditText);
        a3EditText= findViewById(R.id.a3EditText);
        a4EditText= findViewById(R.id.a4EditText);
        a5EditText= findViewById(R.id.a5EditText);
        a6EditText= findViewById(R.id.a6EditText);
        a7EditText= findViewById(R.id.a7EditText);
        a8EditText= findViewById(R.id.a8EditText);
        a9EditText= findViewById(R.id.a9EditText);
        a10EditText= findViewById(R.id.a10EditText);
        b1EditText= findViewById(R.id.b1EditText);
        b2EditText= findViewById(R.id.b2EditText);
        b3EditText= findViewById(R.id.b3EditText);
        b4EditText= findViewById(R.id.b4EditText);
        b5EditText= findViewById(R.id.b5EditText);
        b6EditText= findViewById(R.id.b6EditText);
        b7EditText= findViewById(R.id.b7EditText);
        b8EditText= findViewById(R.id.b8EditText);
        b9EditText= findViewById(R.id.b9EditText);
        b10EditText= findViewById(R.id.b10EditText);
        c1EditText= findViewById(R.id.c1EditText);
        c2EditText= findViewById(R.id.c2EditText);
        c3EditText= findViewById(R.id.c3EditText);
        c4EditText= findViewById(R.id.c4EditText);
        c5EditText= findViewById(R.id.c5EditText);
        c6EditText= findViewById(R.id.c6EditText);
        c7EditText= findViewById(R.id.c7EditText);
        c8EditText= findViewById(R.id.c8EditText);
        c9EditText= findViewById(R.id.c9EditText);
        c10EditText= findViewById(R.id.c10EditText);


        savePdfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
                } else {
                    savePdf();

                }
            }
        });

    }

    public void addRow(View view) {
        TableRow tableRow = new TableRow(this);

        EditText editText1 = new EditText(this);
        EditText editText2 = new EditText(this);
        EditText editText3 = new EditText(this);
        EditText editText4 = new EditText(this);
        EditText editText5 = new EditText(this);
        EditText editText6 = new EditText(this);
        EditText editText7 = new EditText(this);
        EditText editText8 = new EditText(this);
        EditText editText9 = new EditText(this);
        EditText editText10 = new EditText(this);

        editText1.setHint("A");
        editText2.setHint("B");
        editText3.setHint("C");
        editText4.setHint("D");
        editText5.setHint("E");
        editText6.setHint("F");
        editText7.setHint("G");
        editText8.setHint("H");
        editText9.setHint("I");
        editText10.setHint("J");


        tableRow.addView(editText1);
        tableRow.addView(editText2);
        tableRow.addView(editText3);
        tableRow.addView(editText4);
        tableRow.addView(editText5);
        tableRow.addView(editText6);
        tableRow.addView(editText7);
        tableRow.addView(editText8);
        tableRow.addView(editText9);
        tableRow.addView(editText10);

        tableLayout.addView(tableRow);
    }

    private String getLatestFileName(String directoryPath) {
        File directory = new File(directoryPath);

        // Get a list of all the files in the directory
        File[] files = directory.listFiles();

        // Sort the files in descending order based on the last modified timestamp
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return Long.compare(o2.lastModified(), o1.lastModified());
            }
        });

        // Get the name of the latest file (excluding hidden files)
        for (File file : files) {
            if (!file.isHidden()) {
                return file.getName().replace(".pdf", "");
            }
        }

        // Return a default file name if no files were found
        return "Agreement";
    }

    private void savePdf() {
        String sellerName = sellerNameEditText.getText().toString().trim();
        String buyerName = buyerNameEditText.getText().toString().trim();
        String Transporter = transporter.getText().toString().trim();
        String gstin = gst.getText().toString().trim();
        String moreInfo = moreinfo.getText().toString().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = sdf.format(new Date());


        if (sellerName.isEmpty() || buyerName.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter seller name and buyer name", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "PDF_" + timeStamp + ".pdf";
            File pdfFolder = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "PDF Files");

            if (!pdfFolder.exists()) {
                pdfFolder.mkdir();
            }
            File pdfFile = new File(pdfFolder, fileName);
            FileOutputStream outputStream = new FileOutputStream(pdfFile);
            Document document = new Document();


            PdfWriter.getInstance(document, outputStream);
            document.open();


            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.hfull);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
            Image image = Image.getInstance(stream.toByteArray());
            image.scalePercent(2f);
            image.setAlignment(Image.ALIGN_CENTER);
            document.add(image);
//            Image logo = Image.getInstance(R.drawable.hh);
//            logo.setAlignment(Element.ALIGN_CENTER);
//            logo.scalePercent(50f);
//            document.add(logo);


            Font Datef = new Font(Font.FontFamily.TIMES_ROMAN, 20);
            Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD);
            Paragraph Date = new Paragraph("Date" + currentDate, Datef);
            Date.setAlignment(Element.ALIGN_RIGHT);
            document.add(Date);

            Font font = new Font(Font.FontFamily.TIMES_ROMAN, 22);
            Paragraph paragraph = new Paragraph("\nSeller Name: " + sellerName + "\nBuyer Name: " + buyerName + "\nGSTIN: " + gstin + "\nTransport Name: " + Transporter + "\n\n\n", font);
//            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);


            //add table to the document
            PdfPTable table = new PdfPTable(3);

            PdfPCell cell1 = new PdfPCell(new Paragraph("Description", font3));
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);


            PdfPCell cell2 = new PdfPCell(new Paragraph("meter", font3));
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(new Paragraph("Rate", font3));
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell3);

            table.setHeaderRows(1);

            PdfPCell a1Cell = new PdfPCell(new Paragraph(a1EditText.getText().toString().isEmpty() ? " " : a1EditText.getText().toString()));
            a1Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a1Cell);


            PdfPCell b1Cell = new PdfPCell(new Paragraph(b1EditText.getText().toString().isEmpty() ? " " : b1EditText.getText().toString()));
            b1Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b1Cell);

            PdfPCell c1Cell = new PdfPCell(new Paragraph(c1EditText.getText().toString().isEmpty() ? " " : c1EditText.getText().toString()));
            c1Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1Cell);

            PdfPCell a2Cell = new PdfPCell(new Paragraph(a2EditText.getText().toString().isEmpty() ? " " : a2EditText.getText().toString()));
            a2Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a2Cell);

            PdfPCell b2Cell = new PdfPCell(new Paragraph(b2EditText.getText().toString().isEmpty() ? " " : b2EditText.getText().toString()));
            b2Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b2Cell);

            PdfPCell c2Cell = new PdfPCell(new Paragraph(c2EditText.getText().toString().isEmpty() ? " " : c2EditText.getText().toString()));
            c2Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c2Cell);

            PdfPCell a3Cell = new PdfPCell(new Paragraph(a3EditText.getText().toString().isEmpty() ? " " : a3EditText.getText().toString()));
            a3Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a3Cell);

            PdfPCell b3Cell = new PdfPCell(new Paragraph(b3EditText.getText().toString().isEmpty() ? " " : b3EditText.getText().toString()));
            b3Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b3Cell);

            PdfPCell c3Cell = new PdfPCell(new Paragraph(c3EditText.getText().toString().isEmpty() ? " " : c3EditText.getText().toString()));
            c3Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c3Cell);

            PdfPCell a4Cell = new PdfPCell(new Paragraph(a4EditText.getText().toString().isEmpty() ? " " : a4EditText.getText().toString()));
            a4Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a4Cell);


            PdfPCell b4Cell = new PdfPCell(new Paragraph(b1EditText.getText().toString().isEmpty() ? " " : b4EditText.getText().toString()));
            b4Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b4Cell);

            PdfPCell c4Cell = new PdfPCell(new Paragraph(c1EditText.getText().toString().isEmpty() ? " " : c4EditText.getText().toString()));
            c4Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c4Cell);

            PdfPCell a5Cell = new PdfPCell(new Paragraph(a5EditText.getText().toString().isEmpty() ? " " : a5EditText.getText().toString()));
            a5Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a5Cell);


            PdfPCell b5Cell = new PdfPCell(new Paragraph(b5EditText.getText().toString().isEmpty() ? " " : b5EditText.getText().toString()));
            b5Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b5Cell);

            PdfPCell c5Cell = new PdfPCell(new Paragraph(c5EditText.getText().toString().isEmpty() ? " " : c5EditText.getText().toString()));
            c5Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c5Cell);

            PdfPCell a6Cell = new PdfPCell(new Paragraph(a6EditText.getText().toString().isEmpty() ? " " : a6EditText.getText().toString()));
            a6Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a6Cell);

            PdfPCell b6Cell = new PdfPCell(new Paragraph(b6EditText.getText().toString().isEmpty() ? " " : b6EditText.getText().toString()));
            b6Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b6Cell);

            PdfPCell c6Cell = new PdfPCell(new Paragraph(c6EditText.getText().toString().isEmpty() ? " " : c6EditText.getText().toString()));
            c6Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c6Cell);

            PdfPCell a7Cell = new PdfPCell(new Paragraph(a7EditText.getText().toString().isEmpty() ? " " : a7EditText.getText().toString()));
            a7Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a7Cell);

            PdfPCell b7Cell = new PdfPCell(new Paragraph(b7EditText.getText().toString().isEmpty() ? " " : b7EditText.getText().toString()));
            b7Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b7Cell);

            PdfPCell c7Cell = new PdfPCell(new Paragraph(c7EditText.getText().toString().isEmpty() ? " " : c7EditText.getText().toString()));
            c7Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c7Cell);


            PdfPCell a8Cell = new PdfPCell(new Paragraph(a8EditText.getText().toString().isEmpty() ? " " : a8EditText.getText().toString()));
            a8Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a8Cell);


            PdfPCell b8Cell = new PdfPCell(new Paragraph(b8EditText.getText().toString().isEmpty() ? " " : b8EditText.getText().toString()));
            b8Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b8Cell);

            PdfPCell c8Cell = new PdfPCell(new Paragraph(c8EditText.getText().toString().isEmpty() ? " " : c8EditText.getText().toString()));
            c8Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c8Cell);

            PdfPCell a9Cell = new PdfPCell(new Paragraph(a9EditText.getText().toString().isEmpty() ? " " : a9EditText.getText().toString()));
            a9Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a9Cell);


            PdfPCell b9Cell = new PdfPCell(new Paragraph(b9EditText.getText().toString().isEmpty() ? " " : b9EditText.getText().toString()));
            b9Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b9Cell);

            PdfPCell c9Cell = new PdfPCell(new Paragraph(c9EditText.getText().toString().isEmpty() ? " " : c9EditText.getText().toString()));
            c9Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c9Cell);

            PdfPCell a10Cell = new PdfPCell(new Paragraph(a10EditText.getText().toString().isEmpty() ? " " : a10EditText.getText().toString()));
            a10Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(a10Cell);


            PdfPCell b10Cell = new PdfPCell(new Paragraph(b10EditText.getText().toString().isEmpty() ? " " : b10EditText.getText().toString()));
            b10Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(b10Cell);

            PdfPCell c10Cell = new PdfPCell(new Paragraph(c10EditText.getText().toString().isEmpty() ? " " : c10EditText.getText().toString()));
            c10Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c10Cell);

//            int sum = calculateSumOfCColumn();
//            Paragraph sumParagraph = new Paragraph(" "+ sum);

            //document.add(sumParagraph);

//
//            To add the table to the document
//            table.addCell("Total");
//
//            table.addCell(" ");
//
//            table.addCell(sumParagraph);
//

            document.add(table);

            // add details
            Paragraph paragraph2 = new Paragraph("\nDetails:\n", font);
            paragraph2.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph2);

            Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 22);
            Paragraph paragraph3 = new Paragraph(moreInfo, font2);
            paragraph3.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph3);


            document.close();
            outputStream.close();

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("application/pdf");
            intent.putExtra(Intent.EXTRA_STREAM, FileProvider.getUriForFile(MainActivity.this, BuildConfig.APPLICATION_ID + ".provider", pdfFile));
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(intent, "Share PDF"));

//

            Toast.makeText(MainActivity.this, "PDF saved to " + pdfFile.getPath(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "Error saving PDF", Toast.LENGTH_SHORT).show();
        }

    }

    private int calculateSumOfCColumn() {

        int sum = 0;
        sum += Integer.parseInt(c1EditText.getText().toString());
        sum += Integer.parseInt(c2EditText.getText().toString());
        return sum;

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_CODE && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            savePdf();
        } else {
            Toast.makeText(MainActivity.this, "Permission denied", Toast.LENGTH_SHORT).show();
        }
    }
}