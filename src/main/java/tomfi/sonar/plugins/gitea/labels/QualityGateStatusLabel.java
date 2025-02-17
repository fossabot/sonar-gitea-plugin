/**
 * MIT License
 *
 * Copyright (c) 2019 Tomer Figenblat
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tomfi.sonar.plugins.gitea.labels;

/**
 * An object represnting teh Quality Gate label for Gitea.
 */
@SuppressWarnings("PMD.DataClass")
public final class QualityGateStatusLabel implements Label
{
    private final String name;
    private final String description;
    private final String color;
    private final int ident;
    private final String url;

    /**
     * Main and only constructor.
     * @param labelName the label name (value).
     * @param labelDescription the label description.
     * @param labelColor the label color.
     * @param labelId the label id.
     * @param labelUrl the label url.
     */
    public QualityGateStatusLabel(
        final String labelName,
        final String labelDescription,
        final String labelColor,
        final int labelId,
        final String labelUrl
    )
    {
        name = labelName;
        description = labelDescription;
        color = labelColor;
        ident = labelId;
        url = labelUrl;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public String getColor()
    {
        return color;
    }

    @Override
    public int getId()
    {
        return ident;
    }

    @Override
    public String getUrl()
    {
        return url;
    }
}
